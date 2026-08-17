package multipleinterfaces;

public class SmartPhone implements Camera, MusicPlayer  {
    @Override
    public void takePhoto(){
        System.out.println("Taking photo");
    }

    @Override
    public void playMusic(){
        System.out.println("Playing music");
    }
    
}
