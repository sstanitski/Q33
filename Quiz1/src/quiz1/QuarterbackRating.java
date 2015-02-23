package quiz1;
import java.util.Scanner;
public class QuarterbackRating {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of passing attempts: ");
		double att = input.nextDouble();
		System.out.println("Enter number of completions: ");
		double comp = input.nextDouble();
		System.out.println("Enter number of passing yards: ");
		double yds = input.nextDouble();
		System.out.println("Enter number of touchdown passes: ");
		double td = input.nextDouble();
		System.out.println("Enter number of interceptions: ");
		double INT = input.nextDouble();
		PasserRating(aval(comp, att), bval(yds, att), cval(td, att), dval(INT, att));
	}
		public static double aval(double comp, double att){
			double a = ((comp / att) - .3) * 5;return a;
		}
		public static double bval(double yds, double att){
			double b = ((yds / att) - 3) * .25;return b;
		}
		public static double cval(double td, double att){
			double c = (td / att) * 20;return c;
		}
		public static double dval(double INT, double att){
			double d = ((2.375)-((INT / att) * 25));return d;
		}
		public static double mm(double val){
			return Math.max(0, Math.min(val, 2.375));
		}
		public static void PasserRating(double a, double b, double c, double d){
			double PasserRating = (mm(a) + mm(b) + mm(c) + mm(d)) / 6 * 100;
		System.out.print("Your Quartback passer rating is:" + PasserRating);
		}
	}