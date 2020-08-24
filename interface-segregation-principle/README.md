# Interface segregation Principle
### Phát biểu
- Không nên buộc các thực thể phần mềm phụ thuộc vào những interface mà chúng không sử dụng đến.
- Nó giúp giảm sự cồng kềnh, dư thừa không cần thiết cho phần mềm 
và quan trọng hơn là giảm sự kết dính làm hạn chế tính linh động (flexibility) của phần mềm.
### Giải thích
- Khi xây dựng một lớp trừu tượng, nhiều người có xu hướng để cho lớp đối tượng thực hiện càng nhiều chức năng càng tốt,
những lớp đối tượng như vậy được gọi là những lớp đối tượng có interface bị ô nhiễm.
- Khi một lớp đối tượng có interface bị ô nhiễm nó trở lên cồng kềnh. Một thực thể phần mềm nào đó chỉ cần thực hiện một
công việc đơn giản cũng phải làm việc với toàn bộ interface. Dẫn đến sự dư thừa không cần thiết trong các thực thể phần mềm
- Việc buộc phải kế thừ những thành phần không sử dụng cũng làm tăng sự kết dính giữa các thành phần phần mềm. 
- Khi nâng cấp sửa đổi interface thì toàn bộ những lớp kế thừa interface cũng phải thay đổi.
### Class diagram
![Optional Text](../open-closed-principle/OPR.png)