package ru.netology.web.data;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class RegistrationInfo {
    private final String city;
    private final String date;
    private final String otherDate;
    private final String name;
    private final String phone;
}