public class Planet {
    double xxPos;
    double yyPos;
    double xxVel;
    double yyVel;
    double mass;
    String imgFileName;
    //*First Constructor:Character of the plantet*/
    public Planet(double xP,double yp,double xV,
                  double yv,double m,String img){
        xxPos=xP;
        yyPos=yp;
        xxVel=xV;
        yyVel=yv;
        mass=m;
        imgFileName=img;
    }

    public Planet(Planet p){
        this.xxPos=p.xxPos;
        this.yyPos=p.yyPos;
        this.xxVel=p.xxVel;
        this.yyVel=p.yyVel;
        this.mass =p.mass;
        this.imgFileName=p.imgFileName;
    }
}
