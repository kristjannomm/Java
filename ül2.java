package ül1;
		//teeb Stringi Ü12
public class ül2 {
	public static void main(String[] args) {
		
		//tollid
		System.out.println("Tollid meetriks "+tollidM(10));
		
		//ellips
		System.out.println(ellipsS(10,15)+" cmŽ2");
		
		//minutid
		System.out.println(aeg(137));
		
		//kahe sportlase kiirused
		double sportlane1 = kiirus(10,1);
		double sportlane2 = kiirus(20,1);
		System.out.println(vahe(sportlane1, sportlane2));
		}
		//tollid meetriteks
		static double tollidM(int t) {
			//teisendab tollid meetriteks (*0,0254)
			double m = t * 0.0254;
			return m;

		}
		 //ellipsi pindala
		 static double ellipsS(int a, int b){
			 //ellipsi pindala
			 double s = Math.round(Math.PI * a * b);
			 return s;
		 }
		 //teisendab minutid tundideks ja minutiteks
		 static double aeg(int t) {
			 int tteisendamine = t / 60;
			 int mteisendamine = t % 60;
			 System.out.println("Tunnid "+ tteisendamine + " " + "Minutid " + mteisendamine);
			 return tteisendamine;
			 //int hours = t / 60;
			 //int minutes = t % 60;
		 }
		//sportlase kiirus dist/aeg
		static double kiirus(int d, int n) {
			double k = d/n;
			return k;
		 }
		//kiiruste vahe
		static double vahe(double a1, double a2) {
			double vahe = Math.abs(a1 - a2);
			return vahe;
		}
}
