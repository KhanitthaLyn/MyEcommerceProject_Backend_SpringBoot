# MyEcommerceProject (BackEnd)

# E-commerce Application – Full Stack Java (Spring Boot + (React))

A production-grade **E-commerce web application** built with **Spring Boot, Spring Framework, Hibernate, React, (and AWS deployment)**.  
This project covers end-to-end development from backend REST APIs to frontend integration, with secure authentication and real-world eCommerce features.

---

🏗️ System Architecture Overview
React Client 
    → REST Controller 
    → Security (JWT) 
    → Auth Service 
    → Business Service 
    → JPA Repository 
    → Entity Model 
    → Database

1️⃣ Client Layer –
  💻 React.js (Frontend UI)
  🧪 Postman / Thunder Client (API Testing)

2️⃣ Controller Layer –
  🌐 Expose REST endpoints
  🛡️ Validate incoming requests
  📤 Return DTO responses

3️⃣ Security Layer –
  🔐 Spring Security 6
  🔑 JWT Authentication & Authorization
  🧩 Custom Filters:
  🌀 OncePerRequestFilter
  🧿 JwtAuthenticationFilter

4️⃣ Authentication Layer –
  👤 Login / Register
  🔄 Token generation / refresh
  📚 UserDetailsService implementation

5️⃣ Service Layer –
  🧠 Business logic
  🔁 Domain workflows
  🔄 DTO ↔ Entity mapping

6️⃣ Repository Layer –
  🗂️ Spring Data JPA Repositories
  🔍 Query methods
  🧱 Database access abstraction
 
7️⃣ Model / Entity Layer –
  🧩 Domain models
  📊 Table mapping
  🔗 Relationships:
  ➕ @OneToMany
  🔁 @ManyToOne
  🔀 @ManyToMany

8️⃣ Database – 
  🛢️ MySQL / PostgreSQL
  🧱 Schema managed via Hibernate
  
---

## 🚀 Features
- **Authentication & Authorization**: Spring Security with JWT (role-based access, custom auth)
- **Product & Category Management**: Full CRUD APIs
- **Shopping Cart & Orders**: Cart, checkout, order history
- **User Profiles & Addresses**: Manage profile, shipping info
- **Payment Module**: Basic payment and order confirmation
- **Database Integration**: JPA/Hibernate with PostgreSQL/MySQL
- **Deployment**: Spring Boot Profiles + AWS deployment
- **Frontend**: React for SPA + Thymeleaf for server-side rendering
- **Extras**: Pagination, sorting, validation, Lombok, logging

---

## 🛠️ Tech Stack
**Backend:** Java, Spring Boot, Spring MVC, Spring Security, JPA/Hibernate  
**Frontend:** React, Thymeleaf  
**Database:** PostgreSQL, MySQL  
**Tools:** Maven, Lombok, Git, Postman  
**Deployment:** AWS, Docker (optional)  

---


## 🧩 Future Enhancements

- Integration with real payment gateway (Stripe / PayPal).  
- Dark mode theme support.  
- Advanced caching and state management with Redux Toolkit.
- User Reviews & Ratings for customer feedback.
- Personalized product recommendations based on browsing and purchase history.
- Refund and order management system for smooth customer service.
- Wishlist / Favorites to save products for later.
- Search & filter functionality for easier product discovery.
- Analytics dashboard for admins showing sales, orders, and popular products.
- Inventory management to track stock and manage products efficiently.

---
⚠️ This project reflects my real learning journey. Some parts of the code may not yet follow perfect clean-code standards, as my current priority is to deeply understand the full system behavior before performing large-scale refactoring.

⚠️ Refactoring is being done incrementally as my understanding of the system grows.
---


http://localhost:8090/swagger-ui/index.html#/
<img width="796" height="698" alt="Screenshot 2568-11-23 at 11 37 17" src="https://github.com/user-attachments/assets/5aedc916-464c-4bae-a490-0e2dbb464a99" />
<img width="788" height="687" alt="Screenshot 2568-11-23 at 11 37 34" src="https://github.com/user-attachments/assets/7068775d-74cc-42f2-b242-1474a7d9bd38" />
<img width="757" height="673" alt="Screenshot 2568-11-23 at 11 37 58" src="https://github.com/user-attachments/assets/be662728-cb76-4bdb-a509-671069a29b19" />
<img width="1207" height="687" alt="Screenshot 2568-11-23 at 12 02 22" src="https://github.com/user-attachments/assets/f1e4c62e-7489-425c-823b-76c434311fd6" />
<img width="2878" height="1604" alt="image" src="https://github.com/user-attachments/assets/ecd88ed0-2272-4651-bd93-f6848e7aa0bb" />
<img width="2884" height="1600" alt="image" src="https://github.com/user-attachments/assets/44653952-3b2f-453a-87a0-2fee380cb538" />








