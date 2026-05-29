# TapHoaMini

Hệ thống quản lý cửa hàng tạp hóa mini.

![Version](https://img.shields.io/badge/version-0.0.1--SNAPSHOT-blue) ![Java](https://img.shields.io/badge/Java-21-orange) ![Spring Boot](https://img.shields.io/badge/Spring_Boot-4.0.6-green)


## Các tính năng chính

- Quản lý kho hàng tạp hóa.
- Xác thực bảo mật với OAuth2.
- Kết nối cơ sở dữ liệu MSSQL.


## Công nghệ sử dụng

`Java 21`, `Spring Boot 4.0.6`, `Spring Data JPA`, `Spring Security`, `MSSQL`


## Hướng dẫn bắt đầu

### Điều kiện tiên quyết

- Java 21
- MSSQL Server


### Cài đặt và chạy

```bash
mvn clean install
./mvnw spring-boot:run
```


## Cấu hình

| Tên biến | Giá trị mặc định | Mô tả |
| :--- | :--- | :--- |
| `SPRING_DATASOURCE_URL` | <!-- TODO: verify --> | URL kết nối MSSQL |
| `SPRING_DATASOURCE_USERNAME` | <!-- TODO: verify --> | Tài khoản cơ sở dữ liệu |
| `SPRING_DATASOURCE_PASSWORD` | <!-- TODO: verify --> | Mật khẩu cơ sở dữ liệu |


## Cấu trúc dự án

```text
.
├── src/
├── pom.xml
└── mvnw
```


## Đóng góp

Vui lòng tạo Issue hoặc gửi Pull Request để đóng góp ý kiến xây dựng dự án.


## Giấy phép

Dự án này sử dụng giấy phép: <!-- TODO: verify -->
