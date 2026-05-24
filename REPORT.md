# BÁO CÁO BÀI LÀM

## Thông Tin
* **Họ và tên:** Hoàng Minh Khôi

---

## Nội Dung Bài Làm

> Phần 3-5 là phần sàng lọc sơ bộ, ưu tiên cách suy nghĩ, cách chọn việc và cách phản ứng với tình huống hơn là kiến thức thuộc lòng.

### 🔹 Câu 0: Thư viện sử dụng
> **Đề bài:** Giải thích những thư viện được sử dụng trong requirements.txt. <br>
> **Lưu ý:** Nếu không dùng có thể bỏ qua

**Câu trả lời:**
- java.text.Normalizer: Sử dụng để chuẩn hóa chuỗi và bỏ dấu tiếng Việt
- java.util.ArrayList: Dùng để tạo danh sách động lưu các tài khoản.
- java.util.Collections: Dùng để hỗ trợ thao tác sắp xếp
- java.util.Locale: Dùng để xác định chuẩn quốc gia và ngôn ngữ khi format
- java.text.NumberFormat: Dùng để format số tiền theo chuẩn hiển thị
- java.util.Scanner: Dùng để nhập dữ liệu từ bàn phím
### 🔹 Câu 1: BASE CODE
**1.1. Phân tích, giải thích độ phức tạp của thuật toán tìm kiếm theo tên**

**Câu trả lời:**

- Thuật toán tìm kiếm:
    + Lý do chọn: Vì theo yêu cầu đề bài: tìm kiếm tên khách hàng ko phân biệt dấu, hỗ trợ tìm kiếm gần đúng, chứa từ khóa nên ưu tiên dùng thuật toán tìm kiếm tuyến tính để so sánh từng chữ trong chuỗi. Không chọn tìm kiếm nhị phân vì thuật toán này chỉ dùng hiệu quả khi dữ liệu được sắp xếp trước và cần tìm kiếm chính xác
    + Ưu điểm: Dễ code, phù hợp bài toán nhỏ
    + Nhược điểm: Mất nhiều thời gian nếu danh sách có dữ liệu lớn
* độ phức tạp:
    + Duyệt chuỗi: for(list) có độ phức tạp O(n)
 => O(n*m)

**1.2. Những tên sau (VD: Hà br, Dova%#, Trung 777 Hòa,...) gặp vấn đề gì? Và hướng giải quyết vấn đề này là như thế nào? (không yêu cầu code)**

**Câu trả lời: (100 từ)**
> Các tên bên trên đang chứa các tự đặc biệt và số và từ không liên quan. Hướng giải quyết:kiểm tra và loại bỏ các ký tự đặc biệt hoặc giới hạn chỉ cho phép nhập các ký tự hợp lệ

**1.3. Với câu 1.2, liệu thực hiện hướng giải quyết trên đã giúp dữ liệu sạch 100% chưa? Nếu chưa thì phải làm sao để dữ liệu sạch hơn?**

**Câu trả lời: (100 từ)**
> Hướng giải quyết trên chưa giúp dữ liệu sạch 100% vì vẫn có thể tồn tại các trường hợp sai như tên viết tắt, viết sai chính tả hoặc nhập không đúng cấu trúc tên thật. Chưa có hướng tiếp theo để giải quyết các vấn đề còn lại.

### 🔹 Câu 2: WEB SCRAPING
**2.1. Giải thích các trường dữ liệu được trỏ**

**Câu trả lời:**
- Không biết làm

**2.2. Với file đa phương tiện, lấy dữ liệu về kiểu gì?**

**Câu trả lời: (100 từ)**
- Không biết làm
**2.3. Với web động, nơi nếu muốn lấy đầy đủ dữ liệu thì phải tương tác với trang, chiến lược ở đây là gì?**

**Câu trả lời: (100 từ)**
- Không biết làm

### 🔹 Câu 3: DE CASE
> Mục tiêu: xem tư duy dữ liệu, làm sạch, chuẩn hóa, kiểm tra chất lượng và tổ chức đầu ra.

Bạn nhận một gói dữ liệu gồm:
- 1 file CSV có 200 dòng sản phẩm, trong đó có dòng trùng, thiếu giá, và tên sản phẩm không thống nhất.
- 1 file text mô tả sản phẩm.

**3.1. Nếu bạn phải bàn giao dữ liệu này cho team khác dùng tiếp, 4 bước đầu tiên bạn sẽ làm là gì?**

**Câu trả lời:**
> B1: Đọc và kiểm tra cấu trúc file CSV và file text để hiểu dữ liệu đang có gì, số cột, kiểu dữ liệu và các vấn đề ban đầu.
B2: Đọc và kiểm tra cấu trúc file CSV và file text để hiểu dữ liệu đang có gì, số cột, kiểu dữ liệu và các vấn đề ban đầu.
B3: Đọc và kiểm tra cấu trúc file CSV và file text để hiểu dữ liệu đang có gì, số cột, kiểu dữ liệu và các vấn đề ban đầu.
B4:  Kiểm tra lại chất lượng sau khi làm sạchdữ liệu xem đã nhất quán và đầy đủ chưa
**3.2. Trong dữ liệu này, 3 loại lỗi nào bạn sẽ ưu tiên xử lý trước? Vì sao?**

**Câu trả lời:**
> -Lỗi trùng dữ liệu: cần ưu tiên xử lý trước vì dữ liệu trùng có thể làm sai kết quả thống kê, tính toán số lượng hoặc doanh thu.
- Lỗi thiếu giá sản phẩm: đây là dữ liệu quan trọng, nếu thiếu sẽ ảnh hưởng đến việc tính toán, lọc hoặc phân tích sản phẩm.
- Tên sản phẩm không thống nhất: ví dụ cùng một sản phẩm nhưng viết khác nhau sẽ gây khó khăn khi tìm kiếm, nhóm dữ liệu hoặc thống kê. Vì vậy cần chuẩn hóa để dữ liệu đồng nhất hơn.
**3.3. Nếu chỉ được giữ lại 1 phiên bản dữ liệu sạch trong ngày đầu, bạn sẽ giữ những trường nào và bỏ những trường nào?**

**Câu trả lời:**
> Không biết làm

### 🔹 Câu 4: AI CASE
> Mục tiêu: xem tư duy mô hình, chọn baseline, đánh giá và nhìn ra lỗi sai.

Team đưa cho bạn:
- 1 tập dữ liệu nhỏ gồm câu hỏi và câu trả lời mẫu.
- 3 ví dụ model trả lời sai.
- 1 yêu cầu: làm một demo nhỏ trả lời đúng hơn ở mức cơ bản nhất.

**4.1. Nếu là người bắt đầu, bạn sẽ chọn baseline nào trước để thử nhanh?**

**Câu trả lời:**
> Không biết làm

**4.2. Với 3 ví dụ trả lời sai, bạn sẽ phân tích lỗi theo 3 góc nào?**

**Câu trả lời:**
>  Không biết làm

**4.3. Nếu chỉ được cải thiện 1 thứ trong tuần đầu, bạn sẽ ưu tiên dữ liệu, prompt, hay đánh giá? Vì sao?**

**Câu trả lời:**
>  Không biết làm

### 🔹 Câu 5: RAG CASE
> Mục tiêu: xem tư duy truy xuất tài liệu, chia đoạn, tìm đúng ngữ cảnh và kiểm tra câu trả lời có bám nguồn hay không.

Bạn được giao:
- 1 tập tài liệu ngắn rời rạc.
- 10 câu hỏi nội bộ.
- Yêu cầu demo phải trả lời có dẫn nguồn.

**5.1. Bạn sẽ chia tài liệu và chuẩn bị chỉ mục theo cách nào để dễ truy xuất nhất?**

**Câu trả lời:**
>  Không biết làm

**5.2. Nếu câu trả lời gần đúng nhưng dẫn nhầm đoạn, bạn sẽ kiểm tra lỗi ở bước nào trước?**

**Câu trả lời:**
>  Không biết làm

**5.3. Nếu phải chọn giữa trả lời ngắn nhưng chắc, hoặc trả lời dài nhưng có nguy cơ lạc nguồn, bạn sẽ ưu tiên gì trong bản demo đầu tiên?**

**Câu trả lời:**
>  Không biết làm

**5.4. Nếu nguồn dữ liệu có cả ảnh chụp màn hình và văn bản, bạn sẽ gán nhãn ảnh theo tiêu chí nào để phục vụ RAG? Nêu tối thiểu 3 nhãn và mô tả ngắn cho mỗi nhãn.**

**Câu trả lời:**
>  Không biết làm