package aninhadas;

public class ClassAninhada {
    private String texto = "texto externo ";

    public class Interna{
        private String texto = "texto interno ";

        public void imprimiTexto(){
            /**
             *Nas classes aninhadas no java as classes
             * internas tem acesso aos atributos das classes
             * externas nesse contexto a ClassAninhada
             */
            System.out.println(texto);
             //consegue ver membros da classe externa
            System.out.println(ClassAninhada.this.texto);
        }
    }

}


