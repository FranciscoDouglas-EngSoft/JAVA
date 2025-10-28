void main(){
    for(int i = 1; i <= 120; i ++){
        if(i % 2 == 0){
            IO.println(String.format("%d e par", i));
        }else{
            IO.println(String.format("%d e impar", i));
        }
    }
}