# Hotel Booking & Management Backend

Full-featured hotel reservation platform for admins and users with payment integration and real-time inventory.

## Tech Stack
![Java](https://img.shields.io/badge/Java-21-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-green)
![Spring Security](https://img.shields.io/badge/Spring%20Security-JWT-blue)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-316192)
![Redis](https://img.shields.io/badge/Redis-DC382D)
![Stripe](https://img.shields.io/badge/Stripe-008CDD)
![Swagger](https://img.shields.io/badge/Swagger-OpenAPI-green)

## Features

### Authentication (AuthController)
- User signup with email and password
- JWT login with access token + refresh token in HTTP-only cookie
- Token refresh endpoint for seamless user experience

### Hotel Browsing (HotelBrowseController - User)
- Search hotels with filters, pagination, and dynamic pricing
- View detailed hotel information by ID

### Booking Flow (HotelBookingController - User)
- Initialize booking with check-in/check-out dates
- Add multiple guests to a booking
- Initiate Stripe payment session
- Cancel booking
- Check real-time booking status

### User Profile (UserController - User)
- View and update user profile
- Get all previous bookings
- Manage guest list (add, update, delete guests)

### Hotel Management (HotelController - Admin)
- Create, update, delete hotels
- Activate/deactivate hotel listings
- View all hotels owned by admin
- Get all bookings for a hotel
- Generate financial reports with date range

### Room Management (RoomAdminController - Admin)
- Create new rooms in a hotel
- Get all rooms in a hotel
- Get, update, delete room by ID

### Inventory Management (InventoryController - Admin)
- View all inventory (availability) for a room
- Update room inventory and pricing

### Payment Webhook (WebhookController)
- Stripe webhook integration for payment confirmation
- Secure signature verification
- Automated booking status updates after payment

## API Endpoints

| Controller | Base Path | Key Endpoints |
|------------|-----------|---------------|
| AuthController | /auth | POST /signup, POST /login, POST /refresh |
| HotelBrowseController | /hotels | GET /search, GET /{hotelId}/info |
| HotelBookingController | /bookings | POST /init, POST /{bookingId}/addGuests, POST /{bookingId}/payments, POST /{bookingId}/cancel, GET /{bookingId}/status |
| UserController | /users | GET /profile, PATCH /profile, GET /myBookings, GET /guests, POST /guests, PUT /guests/{guestId}, DELETE /guests/{guestId} |
| HotelController | /admin/hotels | POST /, GET /, GET /{hotelId}, PUT /{hotelId}, DELETE /{hotelId}, PATCH /{hotelId}/activate, GET /{hotelId}/bookings, GET /{hotelId}/reports |
| RoomAdminController | /admin/hotels/{hotelId}/rooms | POST /, GET /, GET /{roomId}, PUT /{roomId}, DELETE /{roomId} |
| InventoryController | /admin/inventory | GET /rooms/{roomId}, PATCH /rooms/{roomId} |
| WebhookController | /webhook | POST /payment |

## Database Schema
- **users**: id, email, password, name, roles
- **hotels**: id, name, location, active, admin_id
- **rooms**: id, hotel_id, type, price, capacity
- **inventory**: id, room_id, date, available, price
- **bookings**: id, user_id, hotel_id, room_id, status, amount, check_in_date, check_out_date
- **guests**: id, booking_id, name, email, phone
- **payments**: id, booking_id, stripe_session_id, status

## Architecture Flow

1. User/Admin → AuthController → JWT Token (Access + Refresh in HTTP-only cookie)

2. HotelBrowseController → Search Hotels → Redis Cache → PostgreSQL

3. HotelBookingController → Initialize Booking → Stripe Payment Session

4. WebhookController → Payment Confirmation → Booking Status Updated

## Setup

1. Clone repository
   ```bash
   git clone https://github.com/Walidev1812/hotel-booking.git
   cd hotel-booking
2. Configure PostgreSQL in application.properties
3. Configure Redis
4. Add Stripe API keys
5. Run application
6. Access Swagger UI at http://localhost:8080/swagger-ui.html


## Testing with Postman

1. Signup → Create new account
2. Login → Get JWT access token (refresh token auto-set in cookie)
3. Search Hotels → Find available hotels with dates
4. Initialize Booking → Create booking request
5. Add Guests → Add guest details to booking
6. Initiate Payment → Get Stripe checkout URL
7. Webhook → Simulate payment success (use Stripe CLI)
8. Check Status → Verify booking confirmed
