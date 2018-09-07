/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdatest;

import org.json.JSONObject;

/**
 *
 * @author claudio
 */
public class FullConverter implements FlightConverter {

    public String convert(Flight f) {
        return new JSONObject()
                .put("code", f.getCode())
                .put("from", f.getFrom())
                .put("to", f.getTo())
                .toString();
    }

}
