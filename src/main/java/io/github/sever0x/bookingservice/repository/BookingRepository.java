package io.github.sever0x.bookingservice.repository;

import io.github.sever0x.bookingservice.domain.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
