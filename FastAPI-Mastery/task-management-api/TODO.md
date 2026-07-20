# todo

| Feature     | Endpoint             | Method |
| ----------- | -------------------- | ------ |
| List users  | `GET /users`         | GET    |
| Get user    | `GET /users/{id}`    | GET    |
| Create user | `POST /users`        | POST   |
| Update user | `PATCH /users/{id}`  | PATCH  |
| Delete user | `DELETE /users/{id}` | DELETE |

## User

- id
- first_name
- last_name
- email
- password_hash
- role
- is_active
- updated_at
- created_at

```json
// create user
{
  "first_name": "Ravi",
  "last_name": "Kant",
  "email": "ravi@example.com",
  "password": "Secret@123",
  "role": "manager"
}
```

```json
{
  "id": 1,
  "first_name": "Ravi",
  "last_name": "Kant",
  "email": "ravi@example.com",
  "role": "member",
  "created_at": "2026-07-20T10:00:00Z"
}
```
