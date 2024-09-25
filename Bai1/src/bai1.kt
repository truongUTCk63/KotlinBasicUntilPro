fun main(args: Array<String>) {
    println("Hôm nay tôi học buổi 2");
    //comment
    // khởi tạo biến
    var soA:Int=65;
    var soB:Int=5;
    println("soA is $soA ");
    println("soB is $soB ");
//ep kieu
    var soC:Int=10; // INT to string;
    println("soC is  "+soC.toString());
    // bài 8 nhập dữ liệu từ bàn phím
    println("Mời cụ nhập vào tên ");
    var ten:String ?= readLine();
    println("tên của cụ là "+ten);
//for
    var n:Int = readLine()!!.toInt();
for(i in 1..n step 1){
    print(i);
}
    // try catch
    var a =10;
    var b =5;
    try {
        var c = a/b;
        println(c);
    }
    catch (e: Exception){
        e.printStackTrace();
    }
    finally {
        println("đoạn code vẫn đc thực hiện dù sai");
    }
    //
}