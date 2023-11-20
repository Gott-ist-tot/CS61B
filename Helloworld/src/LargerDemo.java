public class LargerDemo {
    public static int larger(int x,int y){
        if(x > y){
            return x;
        }
        return y;
    }
    public static void main(String[] args){
        System.out.println(larger(-5,10));
    }
}

/*
    1.FUnctions must be as part of a class called method
    2. public static~=def in python
    3.All parameters must declare type
    4.Function in Java only return 1 value
    5. Clean code -> must be self-documented
    6. 註解可使用 /** 開頭來做為method 的註解

 */