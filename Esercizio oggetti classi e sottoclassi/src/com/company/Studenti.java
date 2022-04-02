package com.company;

    public class Studenti {
        public String nome;
        public String cognome;
        public String codiceFiscale;
        public String classe;
        public String mediaVoti;


        public Studenti(String nome, String cognome, String codiceFiscale, String classe, String mediaVoti) {
            this.nome = nome;
            this.cognome = cognome;
            this.codiceFiscale = codiceFiscale;
            this.classe = classe;
            this.mediaVoti = mediaVoti;
        }

              /* public Studenti() {
            this.nome = nome;
            this.cognome = cognome;
            this.codiceFiscale = codiceFiscale;
            this.classe = classe;
            this.mediaVoti = mediaVoti;


        }

        */

            public void studia() {
                System.out.println(nome + " studia");
            }

            public void seguonoLaLezione() {

                System.out.println(nome + " segue la lezione");
            }

            public void CodFisc() {
                System.out.println(" Il suo codice fiscale: " + codiceFiscale);

            }
            public void vaInClasse() {
                System.out.println(" va nella classe: " + classe);
            }
            public void voti(){
                System.out.println(" ed ha una media voti finale di: " + mediaVoti);
            }
            @Override
            public String toString() {
                return "Studenti{" +
                        "nome='" + nome + '\'' +
                        ", cognome='" + cognome + '\'' +
                        ", codiceFiscale='" + codiceFiscale + '\'' +
                        ", classe='" + classe + '\'' +
                        ", mediaVoti='" + mediaVoti + '\'' +
                        '}';
            }
        boolean verificaCodFiscale;

        public void setVerificaCodFiscale(boolean verificaCodFiscale) {
            this.verificaCodFiscale = verificaCodFiscale;
            if (codiceFiscale.length() == 16) {
                System.out.println();
            } else {
                System.out.println("Codice fiscale errato");
            }

        }
    }


