package com.example.taphoamini.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {


    // ===== SUCCESS (1000) =====
    SUCCESS(1000, "Success"),

    // ===== VALIDATION / CLIENT ERROR (2000–2099) =====
    INVALID_REQUEST(2000, "Invalid request"),
    INVALID_KEY(2001, "Invalid key"),
    INVALID_EMAIL(2002, "Invalid email format"),
    INVALID_PASSWORD(2003, "Invalid password format"),
    MISSING_REQUIRED_FIELD(2004, "Missing required field"),
    INVALID_PATCH_REQUEST(2005, "Invalid patch request"),
    NO_FIELDS_TO_UPDATE(2006, "No fields provided for update"),
    INVALID_ROLE(2007, "Invalid role"),
    INVALID_STATUS(2008, "Invalid status value"),

    // ===== AUTHENTICATION & AUTHORIZATION (3000–3099) =====
    UNAUTHENTICATED(3000, "Unauthenticated"),
    UNAUTHORIZED(3001, "Unauthorized"),
    TOKEN_EXPIRED(3002, "Token expired"),
    TOKEN_INVALID(3003, "Invalid token"),
    ACCESS_DENIED(3004, "Access denied"),
    INSUFFICIENT_PERMISSION(3005, "Insufficient permission"),

    // ===== USER / ACCOUNT (4000–4099) =====
    USER_EXISTED(4000, "User already exists"),
    USER_NOT_FOUND(4001, "User not found"),
    EMAIL_EXISTED(4002, "Email already exists"),
    ACCOUNT_DISABLED(4003, "Account is disabled"),
    ACCOUNT_LOCKED(4004, "Account is locked"),
    ROLE_NOT_FOUND(4005, "Role not found"),
    CANNOT_CHANGE_OWN_ROLE(4006, "Cannot change own role"),

    // ===== TOUR DOMAIN (4100–4199) =====
    TOUR_EXISTED(4100, "Tour already exists"),
    TOUR_NOT_FOUND(4101, "Tour not found"),
    TOUR_INACTIVE(4102, "Tour is inactive"),
    TOUR_INVALID_PRICE(4103, "Invalid tour price"),
    TOUR_STATUS_CHANGE_NOT_ALLOWED(4104, "Tour status change not allowed"),
    TOUR_DETAIL_NOT_FOUND(4105, "Tour detail not found"),
    ITINERARY_NOT_FOUND(4106, "Itinerary not found"),
    SUB_IMAGE_NOT_FOUND(4107, "Sub image not found"),

    // ===== CATEGORY / DESTINATION / TRANSPORT (4200–4299) =====
    CATEGORY_EXISTED(4200, "Category already exists"),
    CATEGORY_NOT_FOUND(4201, "Category not found"),
    DESTINATION_NOT_FOUND(4202, "Destination not found"),
    TRANSPORT_NOT_FOUND(4203, "Transport not found"),
    DESTINATION_EXISTED(4204, "Destination already exists"),
    DESTINATION_GROUP_NOT_FOUND(4205, "Destination group not found"),
    DESTINATION_GROUP_EXISTED(4206, "Destination group already exists"),

    // ===== BOOKING / ORDER (4300–4399) =====
    BOOKING_NOT_FOUND(4300, "Booking not found"),
    BOOKING_ALREADY_CANCELLED(4301, "Booking already cancelled"),
    BOOKING_ALREADY_COMPLETED(4302, "Booking already completed"),
    BOOKING_CANNOT_CANCEL(4303, "Booking cannot be cancelled"),
    SEATS_NOT_AVAILABLE(4304, "Not enough seats available"),

    // ===== REVIEW / FEEDBACK (4400–4499) =====
    REVIEW_NOT_FOUND(4400, "Review not found"),
    REVIEW_ALREADY_EXISTS(4401, "Review already exists"),
    REVIEW_NOT_ALLOWED(4402, "Review not allowed"),

    // ===== PASSENGER (4310–4319) =====
    PASSENGER_NOT_FOUND(4310, "Passenger not found"),

    // ===== REFUND (4320–4329) =====
    REFUND_NOT_FOUND(4320, "Refund not found"),

    // ===== BLOG (4500–4599) =====
    BLOG_NOT_FOUND(4500, "Blog not found"),
    BLOG_CATEGORY_NOT_FOUND(4501, "Blog category not found"),
    BLOG_CATEGORY_EXISTED(4502, "Blog category already exists"),

    // ===== SERVICE & BOOKING SERVICE (4600-4699) =====
    SERVICE_NOT_FOUND(4600, "Service not found"),
    BOOKING_SERVICE_NOT_FOUND(4601, "Booking service not found"),

    // ===== RESOURCE / BUSINESS COMMON (5000–5099) =====
    RESOURCE_NOT_FOUND(5000, "Resource not found"),
    RESOURCE_ALREADY_EXISTS(5001, "Resource already exists"),
    OPERATION_NOT_ALLOWED(5002, "Operation not allowed"),
    DATA_INTEGRITY_VIOLATION(5003, "Data integrity violation"),

    // ===== SYSTEM / INFRASTRUCTURE (9000–9099) =====
    INTERNAL_SERVER_ERROR(9000, "Internal server error"),
    SERVICE_UNAVAILABLE(9001, "Service unavailable"),
    DATABASE_ERROR(9002, "Database error"),

    // ===== UNCATEGORIZED (9999) =====
    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized exception");

    private final int code;
    private final String message;
}
