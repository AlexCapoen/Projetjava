class Humain {

//__________________Init________________________________________________________

  private final prenom;
  private surnom;
  private porteMonnaie;
  private coteDePopularite;
  private criSignifictatif;

  public Humain(String prenom,String surnom,double porteMonnaie,int coteDePopularite,String criSignifictatif){
    this.prenom = prenom;
    this.surnom = surnom;
    this.porteMonnaie = porteMonnaie;
    this.coteDePopularite = coteDePopularite;
    this.criSignifictatif = criSignifictatif;
  }

//__________________method______________________________________________________

  public void parler(String blabla){
  System.out.println(this.prenom+" "+this.surnom+" : "+blabla);
  }

  public void boire(Boisson boisson){
    System.out.println(this.prenom+" "+this.surnom+" boit : "+boisson.name);
  }

  public void offrirUnVerre(Boisson boisson,int prix,Humain receveur){
    this.porteMonnaie = this.porteMonnaie - prix;
    this.coteDePopularite = this.coteDePopularite + 1;
    seFaireOfrrirUnVerre(Humain receveur,Boisson boisson);
  }

  public void sePresenter(){
    System.out.println("Bonjour, je suis "+this.prenom+" "+this.surnom);
  }
}
