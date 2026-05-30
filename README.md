# TapHoaMini

## Giới thiệu

TapHoaMini là một hệ thống quản lý cửa hàng tạp hóa mini gọn nhẹ được xây dựng trên nền tảng Spring Boot. Dự án cung cấp giao diện backend hỗ trợ quản lý kho hàng, danh mục sản phẩm, và tài khoản người dùng với hệ thống bảo mật và cơ sở dữ liệu MSSQL Server.

## Tính năng nổi bật

- **Quản lý kho hàng**: Theo dõi và quản lý các sản phẩm, danh mục sản phẩm.
- **Xác thực bảo mật**: Triển khai bảo mật OAuth2 Resource Server.
- **Kết nối cơ sở dữ liệu**: Kết nối và lưu trữ dữ liệu với MSSQL Server thông qua Spring Data JPA.

## Công nghệ sử dụng

- **Java**: 21
- **Framework**: Spring Boot 4.0.6
- **Bảo mật (Security)**: Spring Security & Spring Security OAuth2 Resource Server
- **Truy cập dữ liệu**: Spring Data JPA
- **Cơ sở dữ liệu**: MSSQL Server (thông qua `mssql-jdbc`)
- **Tiện ích**: Lombok

## Cấu trúc dự án

```text
TapHoaMini/
├── .mvn/                   # Cấu hình Maven wrapper
├── src/
│   ├── main/
│   │   ├── java/com/example/taphoamini/
│   │   │   ├── controller/ # REST controllers (TODO: hiện thực các API endpoint)
│   │   │   ├── enums/      # Các enum dùng trong ứng dụng
│   │   │   ├── exception/  # Xử lý ngoại lệ (Exception handlers)
│   │   │   ├── mapper/     # Lớp chuyển đổi DTO mappers
│   │   │   ├── model/      # Các thực thể database (Categories, Products, User)
│   │   │   ├── repository/ # Các repository của Spring Data JPA
│   │   │   ├── service/    # Tầng xử lý logic nghiệp vụ (Service layer)
│   │   │   └── TapHoaMiniApplication.java # Lớp khởi chạy ứng dụng chính
│   │   └── resources/
│   │       ├── static/     # Tài nguyên tĩnh
│   │       ├── templates/  # Các template MVC
│   │       └── application.properties # File cấu hình chính của ứng dụng
│   └── test/               # Unit test và integration test
├── mvnw                    # Script chạy Maven wrapper cho Unix
├── mvnw.cmd                # Script chạy Maven wrapper cho Windows
└── pom.xml                 # Cấu hình build Maven và dependencies
```

## Điều kiện tiên quyết

Trước khi thiết lập dự án, hãy đảm bảo bạn đã cài đặt các phần mềm sau:
- **Java Development Kit (JDK)**: phiên bản 21 hoặc cao hơn
- **Maven**: 3.8+ (hoặc có thể sử dụng Maven wrapper `mvnw` đi kèm)
- **Cơ sở dữ liệu**: MSSQL Server

## Cài đặt

1. Sao chép repository này về máy:
   ```bash
   git clone <repository-url>
   cd TapHoaMini
   ```

2. Biên dịch và cài đặt các thư viện cần thiết bằng Maven:
   ```bash
   mvn clean install
   ```

## Cấu hình

Cấu hình các thông số kết nối cơ sở dữ liệu bằng cách chỉnh sửa tệp `src/main/resources/application.properties` hoặc thiết lập các biến môi trường sau:

| Tên biến môi trường | Giá trị mặc định | Mô tả |
| :--- | :--- | :--- |
| `SPRING_DATASOURCE_URL` | `TODO` | URL kết nối JDBC đến MSSQL |
| `SPRING_DATASOURCE_USERNAME` | `TODO` | Tên tài khoản cơ sở dữ liệu MSSQL |
| `SPRING_DATASOURCE_PASSWORD` | `TODO` | Mật khẩu tài khoản cơ sở dữ liệu MSSQL |

## Khởi chạy ứng dụng

Chạy ứng dụng trong môi trường phát triển (development):

```bash
./mvnw spring-boot:run
```

Để chạy trong môi trường production, đóng gói ứng dụng thành file JAR và khởi chạy:

```bash
mvn clean package
java -jar target/TapHoaMini-0.0.1-SNAPSHOT.jar
```

## Tài liệu API

`TODO: Cung cấp tài liệu chi tiết về các API endpoint, định dạng request/response và yêu cầu xác thực sau khi các router API được hiện thực.`

## Ví dụ sử dụng

`TODO: Cung cấp các ví dụ thực tế về việc gọi API hoặc tương tác với hệ thống.`

## Kiểm thử

Khởi chạy các bộ kiểm thử tự động bằng Maven:

```bash
mvn test
```

## Triển khai

`TODO: Hướng dẫn chi tiết quy trình triển khai và các môi trường triển khai thực tế.`

## Đóng góp

1. Fork dự án này.
2. Tạo nhánh tính năng mới (`git checkout -b feature/AmazingFeature`).
3. Commit các thay đổi (`git commit -m 'Add some AmazingFeature'`).
4. Push nhánh tính năng lên GitHub (`git push origin feature/AmazingFeature`).
5. Tạo một Pull Request mới.

Vui lòng đảm bảo mã nguồn tuân thủ các quy chuẩn định dạng và phong cách viết code của dự án.

## Giấy phép

`TODO: Xác định giấy phép của dự án (ví dụ: MIT, Apache 2.0).`

## Liên hệ

`TODO: Thông tin người duy trì hoặc hỗ trợ dự án.`
