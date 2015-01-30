package cool;

public class Monster {

	
        public final String TOMBSTONE = "Here Lies a Dead monster";
        private int health = 500;
        private int attack = 20;
        private int movement = 2;
        private int xPosition =0;
        private boolean alive = true;
        public String name = "Big Monster";
        
        public int getAttack()
        {
        	return attack;
        }
        public int getMovement()
        {
        	return movement;
        }
        
        public int getHealth()
        {
        	return health;
        }
        //You can create multiple versions using the same method name
        //now setHealth can except an attack that contains decimals
        //When overloading a method you cant just change the return type
        //Focus on creating method that accept different parameters
        
        public void setHealth(int decreaseHealth)
        {
        	health = health - decreaseHealth;
        	if(health<0)
        	{
        		alive = false;
        	}
        }
	
         public void  setHealth(double decreaseHealth)
         {
        	 int intDecreaseHealth = (int) decreaseHealth;
        	 health = health -intDecreaseHealth;
        	 if(health<0)
        	 {
        		 alive = false;
        	 }
        	 
         }

         /* The Constructor
          * Code that is executed when an object is created from this class definition
          * The methods name is same as the class
          * The constructor is only executed once per object
          * The constructor can't return a value
          */
          
          public Monster(int health,int attack,int movement)
          {
        	  this.health = health;
        	  this.attack = attack;
        	  this.movement = movement;
        	  /*If the attributes had the same names as the class health, attack, movement
        	   * You could refer to the objects fields by proceeding them with this
        	   * this.health = health;
        	   * this.attack = attack;
        	   * objectFieldName = attributeFieldName;
        	   */
}
          //You can overload constructors like any other method
          //The following constructor is the one provided by default if you don't create any other constructors
          public Monster()
          {
        	  
          }
          
          /*You can use the this keyword to call other constructors
           * public LessonSeven(int newHealth)
           * {
           * health = newHealth;
           * }
           * 
           * public LessonSeven(int newHealth, int newAttack)
           * {
           *     this(newHealth);//Any calls to another constructor must occur on
           *     the first line
           *     attack = newAttack;
           *     }
           *     
           */
          public static class JavaLesson
          {
        	  public static void main(String[] args)
        	  {
        		  //You create an object using the blueprint of this class as follows
        		  //className objectName = new className();
        		  Monster frank = new Monster();
        		  //since the objects name is public you can change it directly
        		  frank.name = "Frank";
        		  //You retrieve class field values by listing the objectName.fieldName
        		  //You execute class methods by listing objectName.methodName();
        		  System.out.println(frank.name + " has an attack value of " + frank.getAttack());
        	  }
          }
}



