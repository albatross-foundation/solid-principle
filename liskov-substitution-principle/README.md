# Liskov Substitution Principle
### Phát biểu
- Các lớp dẫn suất có thể thay thế bởi lớp cha.
- Lớp B được gọi là kế thừa từ lớp A khi và chỉ khi với mọi hàm F thao tác trên đối tượng của lớp A
thì hành vi của F không thay đổi khi thay thế các đối tượng của lớp A bằng các đối tượng của lớp B
### Giải thích
- Cần xét lại tính kế thừa của lập trình hướng đối tượng, đó là tính chất một lớp có khả năng tái sử dụng các thuộc tính
và phương thức của lớp khác và quan trọng hơn là có các hành vi như lớp cha của nó.
- Quan hệ IS A thường được sử dụng để xác định kế thừa. Lớp con kế thừa lớp cha khi lớp con có quan hệ IS A với lớp cha.
Có nghĩa là lớp con là trường hợp đặc biệt của lớp cha.
- Ví dụ: Hình vuông là 1 trường hợp đặc biệt của hình chữ nhật.
### Class diagram
![Optional Text](../open-closed-principle/OPR.png)