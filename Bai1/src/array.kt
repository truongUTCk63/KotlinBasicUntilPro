fun main() {
    var n:Int = readLine()!!.toInt();
    var M:IntArray = IntArray(n);
    for(i in 0 until n step 1){
        M[i]   = readLine()!!.toInt();
    }
    for(i in 0 until n step 1){
        print(M[i]);
    }
    println("mang 2 chieu");
    // mảng 2 chiều
     var M2 :Array<IntArray> = Array(n) { IntArray(n) };
        for(i in 0 until n step 1){
            for(j in 0 until n step 1){
                M2[i][j] = readLine()!!.toInt();
            }
        }
    for(i in 0 until n step 1){
        for(j in 0 until n step 1){
            print("${M2[i][j]} \t");
        }
        println();
    }
    // cach 2
//    for(i in M2.indices){}// chay chi so 0 1 2 3 ....;
}