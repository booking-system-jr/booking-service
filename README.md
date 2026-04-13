# Booking Service

Service that handles booking/reservations for listings.

Running locally

From the `booking-service` folder:

```powershell
.\mvnw.cmd spring-boot:run
```

Build

```powershell
.\mvnw.cmd clean package -DskipTests
```

Notes

- Check `src/main/resources/application.yaml` for port and DB config.
- When running multiple services locally, ensure discovery and config servers are running so this service can obtain configuration and register.
