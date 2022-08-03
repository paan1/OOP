public class  Circle {
    
        double radius = 1;
        Circle() {
        }
        
        Circle(double newRadius) {
            radius = newRadius;
        }
        
        double getArea() {
         return radius * radius * Math.PI;
        }
        
        double getPerimeter() {
        return 2 * radius * Math.PI;
        }
        
        double setRadius(double newRadius) {
         return radius = newRadius;
        }
    }
        

