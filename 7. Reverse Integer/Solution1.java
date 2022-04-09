class Solution {
    public int reverse(int x) {
        try{
          boolean negativo = (x < 0); 
          if (negativo){
              x = x*-1;
          }          
          int resultado = Integer.parseInt(new StringBuilder(Integer.toString(x)).reverse().toString());          
          if (negativo){
              resultado = resultado*-1;
          }
          return resultado;
        }
        catch  (Exception e) {
            return 0;
        } 
    }
}