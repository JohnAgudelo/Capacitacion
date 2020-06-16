package com.sophos.nivel1.Capacitacion;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        int _variable1 = 5;
        byte nombreByte = 65;
        System.out.println(nombreByte);
        short variableShort = Short.MAX_VALUE;
        System.out.println(variableShort);
        int variableInt = 78;
        System.out.println(variableInt);
        char variableChar = 'j';
        byte variableCasteoByte = (byte) variableChar;
        System.out.println(variableCasteoByte);
        
        char [] arregloChar = {'J', 'o', 'h', 'n' };
        for (int i = 0; i < arregloChar.length; i++)
        {
        int x = (int) arregloChar[i]+1;
        }
        System.out.println(arregloChar);
    }

}