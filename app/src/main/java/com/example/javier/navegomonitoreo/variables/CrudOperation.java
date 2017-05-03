package com.example.javier.navegomonitoreo.variables;

public interface CrudOperation {
    int NO_OP = 0;
    int CREATE_OP = 1;
    int UPDATE_OP = 2;
    int DELETE_OP = 3;

    class CrudOperationConvert{
        public static String getOperation(int operation){
            String op = "";
            switch (operation){
                case CREATE_OP:
                    op = "n";
                    break;
                case UPDATE_OP:
                    op = "u";
                    break;
                case DELETE_OP:
                    op = "d";
                    break;
            }
            return op;
        }
    }
}
