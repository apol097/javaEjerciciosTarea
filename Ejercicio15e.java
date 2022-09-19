public class Ejercicio15e {
    public static void main(String[] args) {
      int _columnas, _filas;
      _columnas = _filas = 5;
      
      for(int filas = 1 ; filas <= _filas ; filas++){
        for( int columnas = 1 ; columnas <= _columnas ; columnas++){
            if(filas%2 == 0){
                System.out.print(" *");
            }else {
                System.out.print("* "); 
            }
        }
        System.out.println("");
      }
    }
}

