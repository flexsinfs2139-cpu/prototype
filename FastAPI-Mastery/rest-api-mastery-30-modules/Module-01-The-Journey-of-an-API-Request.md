# Module 1 — The Journey of an API Request

> **Question:** What actually happens from the moment a user taps a button in a Flutter app until they receive a response?

## Learning Outcome

By the end of this module, you'll understand the complete lifecycle of an API request—from a Flutter button press to a database query and back. This mental model is the foundation of backend engineering.

---

# Why This Matters

Imagine you have a login button.

```dart
ElevatedButton(
  onPressed: login,
  child: const Text("Login"),
)
```

Looks simple, but behind that button dozens of systems work together in milliseconds.

A senior backend engineer thinks about the complete request lifecycle, not just "calling an API."

---

# The Big Picture

```text
User
 │
 ▼
Flutter UI
 │
 ▼
HTTP Client (Dio/http)
 │
 ▼
Operating System Network Stack
 │
 ▼
DNS Lookup
 │
 ▼
TCP Connection
 │
 ▼
TLS Handshake (HTTPS)
 │
 ▼
Internet
 │
 ▼
Load Balancer (optional)
 │
 ▼
Reverse Proxy
 │
 ▼
FastAPI
 │
 ▼
Authentication Middleware
 │
 ▼
Business Logic
 │
 ▼
Repository
 │
 ▼
PostgreSQL
 │
 ▲
Database Result
 │
 ▲
JSON Response
 │
 ▲
Internet
 │
 ▲
Flutter
 │
 ▲
UI Updates
```

---

# Step 1 — User Interaction

The user taps the **Login** button.

```dart
ElevatedButton(
  onPressed: () async {
    await login();
  },
  child: const Text("Login"),
)
```

Flutter starts executing Dart code. Nothing has left the device yet.

---

# Step 2 — Flutter Creates an HTTP Request

```dart
await dio.post(
  "/login",
  data: {
    "email": email,
    "password": password,
  },
);
```

Conceptually:

```http
POST /login HTTP/1.1
Host: api.example.com
Content-Type: application/json

{
  "email": "alice@example.com",
  "password": "secret"
}
```

---

# Step 3 — DNS Lookup

The device knows the hostname:

```text
api.example.com
```

DNS translates it into an IP address.

```text
Flutter
   │
   ▼
api.example.com
   │
   ▼
DNS Server
   │
   ▼
203.0.113.10
```

---

# Step 4 — TCP Connection

Before data can be exchanged, the client and server establish a reliable connection.

```text
Client                Server

SYN  ------------->

      <------------ SYN-ACK

ACK  ------------->
```

TCP guarantees ordered, reliable delivery.

---

# Step 5 — TLS Handshake

HTTPS uses TLS to encrypt communication.

```text
Client
   │
TLS Handshake
   │
Secure Channel
```

Passwords and tokens travel encrypted.

---

# Step 6 — HTTP Request Travels

The request crosses multiple networks.

```text
Phone
 ↓
Wi-Fi / Mobile
 ↓
ISP
 ↓
Routers
 ↓
Cloud
 ↓
Backend
```

---

# Step 7 — Reverse Proxy

Typical production setup:

```text
Internet
   │
   ▼
Nginx
   │
   ▼
FastAPI
```

Responsibilities include TLS termination, routing, compression, and load balancing.

---

# Step 8 — FastAPI Receives the Request

```python
@app.post("/login")
async def login(request: LoginRequest):
    ...
```

Pydantic validates incoming JSON before business logic executes.

---

# Step 9 — Authentication

```text
Validate Request
      │
      ▼
Find User
      │
      ▼
Verify Password
      │
      ▼
Generate JWT
      │
      ▼
Return Tokens
```

---

# Step 10 — Business Logic

```python
user = user_service.authenticate(email, password)
```

The service layer contains application rules.

---

# Step 11 — Database Query

```sql
SELECT *
FROM users
WHERE email='alice@example.com';
```

PostgreSQL returns matching records.

---

# Step 12 — Response

```json
{
  "access_token": "...",
  "refresh_token": "..."
}
```

FastAPI serializes the response into JSON.

---

# Step 13 — Return Trip

The encrypted response travels back across the network to the device.

---

# Step 14 — Flutter Parses the Response

```dart
final response = await dio.post(...);
```

Access the payload using:

```dart
response.data
```

---

# Step 15 — UI Updates

```dart
setState(() {
  isLoggedIn = true;
});
```

Or update state using Riverpod or another state management solution.

---

# Common Misconceptions

- Flutter does **not** connect directly to the database.
- HTTP is not encrypted; HTTPS is.
- Databases return rows, not JSON.
- APIs are responsible for business logic.

---

# Performance Notes

Typical latency breakdown (illustrative):

| Component | Time |
|-----------|-----:|
| DNS | 5 ms |
| TCP | 10 ms |
| TLS | 20 ms |
| Network | 30 ms |
| FastAPI | 5 ms |
| Database | 15 ms |
| Serialization | 2 ms |
| Return Network | 30 ms |

---

# Interview Questions

1. What is DNS?
2. Why do we need TCP?
3. What does TLS protect?
4. Why shouldn't mobile apps connect directly to databases?
5. Where should business logic live?

---

# Exercise

Draw the request lifecycle for:

```text
Flutter
  │
POST /tasks
  │
FastAPI
  │
PostgreSQL
  │
JSON Response
  │
Flutter UI
```

Explain what happens at each step.

---

# Summary

You now understand the end-to-end journey of an API request:

1. User interaction
2. HTTP request creation
3. DNS resolution
4. TCP connection
5. TLS handshake
6. Internet routing
7. Reverse proxy
8. FastAPI processing
9. Authentication
10. Business logic
11. Database access
12. Response serialization
13. Network return
14. Flutter parsing
15. UI update

This mental model will be reused throughout the remaining modules.
