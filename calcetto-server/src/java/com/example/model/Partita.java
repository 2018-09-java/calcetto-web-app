/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.model;

import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 *
 * @author Valentino
 */
public class Partita {

    private LocalDateTime data;

    private int numeroPartecipanti = 0;
    private String struttura = "Unknown";

    private Partita() {

    }

    public LocalDateTime getData() {
        return this.data;
    }

    public int getNumeroPartecipanti() {
        return this.numeroPartecipanti;
    }

    public String getStruttura() {
        return this.struttura;
    }

    public static class Builder {

        private LocalDateTime data;
        private int numeroPartecipanti = 0;
        private String struttura = "Unknown";

        public Builder setData(LocalDateTime data) {
            this.data = data;
            return this;
        }

        public Builder setNumeroPartecipanti(int numeroPartecipanti) {
            this.numeroPartecipanti = numeroPartecipanti;
            return this;
        }

        public Builder setStruttura(String struttura) {
            this.struttura = struttura;
            return this;
        }

        public Partita build() {

            if (this.numeroPartecipanti > 10) {
                throw new IllegalArgumentException("Numero partecipanti non corretto. Valore max 10.");
            }

            Partita partita = new Partita();
            partita.data = this.data;

            partita.numeroPartecipanti = this.numeroPartecipanti;
            partita.struttura = this.struttura;
            return partita;
        }

    }
}

//
//
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.example.model;
//
///**
// *
// * @author claudio
// */
//public class Flight {
//
//    private String code = "AZ793";
//    private String from = "Rome";
//    private String to = "Munich";
//      private Flight() {};
//    // NO! Perché dovrei creare tanti costruttori per casi diversi
////    Flight(String code, String from, String to) {
////        this.code = code;
////        this.from = from;
////        this.to = to;
////    }
//    public String getCode() {
//        return this.code;
//    }
//
//    public String getFrom() {
//        return this.from;
//    }
//
//    public String getTo() {
//        return this.to;
//    }
//
//    // NO! Perché non ho il controllo di quando viene chiamato il set
////    public void setCode(String code) {
////        this.code = code;
////    }
//    // SOLUZIONE: uso il Builder Design Pattern
//    public static class Builder {
//
//        private String code = "";
//        private String from = "Unknown";
//        private String to = "Unknown";
//
//        public Builder setCode(String code) {
//            this.code = code;
//            return this;
//        }
//
//        public Builder setFrom(String from) {
//            this.from = from;
//            return this;
//        }
//
//        public Builder setTo(String to) {
//            this.to = to;
//            return this;
//        }
//
//        public Flight build() {
//
//            if (this.code.isEmpty()) {
//                throw new IllegalArgumentException("Flight code is not set. Please set it.");
//            }
//            if ((this.from.equals("Unknown")
//                    && !this.to.equals("Unknown"))
//                    || (this.to.equals("Unknown")
//                    && !this.from.equals("Unknown"))) {
//                throw new IllegalArgumentException("From or to should be both set or default. Please set both of them or leave the default values.");
//            }
//
//            Flight flight = new Flight();
//            flight.code = this.code;
//            flight.from = this.from;
//            flight.to = this.to;
//            return flight;
//        }
//
//    }
//}
