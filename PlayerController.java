
  private String jumpKey = "jump";
  private String runKey = "run";
  private String joystickAxis = "joystick";
  private String slideAxis = "slide";

  public float walkSpeed = 2;
  public float runSpeed = 6;
  private float moveLerpSpeed = 2;
  private float jumpSpeed = 7;
  public float horizontalSensitivity = 10f;
  public float verticalSensitivity = 4;
  private float cameraMinAngle = -89;
  private float currentAngle;
  private float cameraMaxAngle = 89;
  private Characterbody cb;
  private Vector2 slideVec = new Vector2();
  private Vector3 dir = new Vector3(0,0,0);
  private float appliedSpeed = 0;
  private float speed;
  private SpatialObject camera;
  
  @Override
  public void start() {
    cb = (Characterbody) myObject.getPhysics().getPhysicsEntity();
    camera = myObject.findChildObject("Cam");
  }

  @Override
  public void repeat() {
  
    Key jump = Input.getKey(jumpKey);
    Key run = Input.getKey(runKey);
  Axis joy = Input.getAxis(joystickAxis);
    Axis slide = Input.getAxis(slideAxis);
    slideVec.setX(-slide.getValue().getX());
    slideVec.setY(-slide.getValue().getY());
    
    // horizontal slide
    myObject.getTransform().rotateInSeconds(0, slideVec.getX() * horizontalSensitivity * 360 * 0.0040f, 0);

    // vertical slide
    currentAngle += slideVec.getY() * verticalSensitivity * 90 * 0.0008f;
    
   // verticalSlide();
          currentAngle = Math.clamp(cameraMinAngle, currentAngle, cameraMaxAngle);
          float cos = Math.cos(currentAngle);
          float sin = Math.sin(currentAngle);
          dir.set(0, sin, cos);
          camera.getTransform().getRotation().localLookTo(dir);

    // jump
    if (jump.isDown() || jump.isPressed()) {
      if (cb.canJump() && cb.onGround()) {cb.jump();}
    } 

    // walk & run
    speed = walkSpeed;
    if (run.isPressed()){speed = runSpeed;}
    appliedSpeed = Math.lerpInSeconds(speed, speed, moveLerpSpeed);
    cb.setForwardSpeed(appliedSpeed * joy.getValue().getY());
    cb.setSideSpeed(appliedSpeed * -joy.getValue().getX());
    cb.setJumpSpeed(jumpSpeed);
    
}
