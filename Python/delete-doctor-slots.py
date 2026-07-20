import requests

BASE_URL = "https://clinikio.com/v1/api"

TOKEN = "b2bf33df30012b16160f4db3b3fbdd1368f9e7c7"

HEADERS = {
    "Authorization": f"Bearer {TOKEN}",
    "Content-Type": "application/json"
}

def fetch_slots():
    try:
        response = requests.get(f"{BASE_URL}/doctor/slots/", headers=HEADERS)
        response.raise_for_status()
        data = response.json()
        slots = data.get("slots", [])
        print(f"✅ Fetched {len(slots)} slot(s).\n")
        return slots
    except requests.exceptions.HTTPError as e:
        print(f"❌ HTTP error while fetching slots: {e} | Response: {response.text}")
    except requests.exceptions.ConnectionError:
        print("❌ Connection error. Check your internet or the API URL.")
    except requests.exceptions.Timeout:
        print("❌ Request timed out while fetching slots.")
    except Exception as e:
        print(f"❌ Unexpected error while fetching slots: {e}")
    return []


def delete_slot(slot_id):
    try:
        response = requests.delete(f"{BASE_URL}/doctor/slots/{slot_id}/", headers=HEADERS)
        response.raise_for_status()
        print(f"  ✅ Deleted slot ID {slot_id}")
    except requests.exceptions.HTTPError as e:
        print(f"  ❌ Failed to delete slot {slot_id}: {e} | Response: {response.text}")
    except requests.exceptions.ConnectionError:
        print(f"  ❌ Connection error while deleting slot {slot_id}.")
    except requests.exceptions.Timeout:
        print(f"  ❌ Timeout while deleting slot {slot_id}.")
    except Exception as e:
        print(f"  ❌ Unexpected error deleting slot {slot_id}: {e}")


def delete_all_slots():
    print("\n🔍 Fetching doctor slots...\n")
    slots = fetch_slots()

    if not slots:
        print("⚠️  No slots found. Nothing to delete.")
        return

    print(f"🗑️  Starting deletion of {len(slots)} slot(s)...\n")
    for index, slot in enumerate(slots, start=1):
        slot_id = slot.get("id")
        date    = slot.get("date")
        start   = slot.get("start_time")
        end     = slot.get("end_time")
        print(f"  [{index}/{len(slots)}] Slot ID {slot_id} | {date} | {start} - {end}")
        delete_slot(slot_id)

    print("\n🎉 All slots processed.")


if __name__ == "__main__":
    delete_all_slots()
