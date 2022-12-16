interface Actions{
    public void move();
    public void sense();
    public void eat();
    public void starve();
    public void speak();
    public void die();
    public void reproduce();
    public void createCreature();
}

class CreatureActions implements Actions{
    public void move(){
        return false;
    }
    public void sense(){
        return false;
    }

    public void eat(){
        return false;
    }

    public void starve(){
        return false;
    }

    public void speak(){
        return false;
    }

}

class Creature extends CreatureActions implements Actions{
    public void die(){
        return false;   
    }

    public void reproduce(){
        return false;
    }
}

class World{

    public void createCreature(){
       
    }
    
}
