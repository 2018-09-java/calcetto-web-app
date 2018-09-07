/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdatest;

import java.util.function.Function;
import org.json.JSONObject;

/**
 *
 * @author claudio
 */
public class Main10 {

    static Flight flight = new Flight.Builder()
            .setCode("LAMBDA-TEST")
            .setFrom("Fisciano")
            .setTo("San Francisco")
            .build();

    static <T, U> U convert(Function<T, U> converter, T obj) {
        return converter.apply(obj);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String simple = convert(
                f -> new JSONObject()
                        .put("code", f.getCode())
                        .toString(),
                flight);

        String full = convert(
                f -> new JSONObject()
                        .put("code", f.getCode())
                        .put("from", f.getFrom())
                        .put("to", f.getTo())
                        .toString(),
                flight);

        String string = convert(
                s -> new JSONObject()
                        .put("myString", s)
                        .toString(),
                "Mi chiamo Claudio :)");

        Integer codeLen = convert(
                f -> f.getCode().length(),
                flight);

        System.out.println("SimpleConverter: " + simple);
        System.out.println("FullConverter: " + full);

        System.out.println("StringConverter: " + string);

        System.out.println("DoubleConverter: " + codeLen);

    }

}
