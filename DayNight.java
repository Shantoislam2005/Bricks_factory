package JAVARuntime;

// Useful imports
import java.util.*;
import java.text.*;
import java.net.*;
import java.math.*;
import java.io.*;
import java.nio.*;

/**
 * @Author 
*/
public class DayNight extends Component { 
public SpatialObject Moon;
public SpatialObject Sun;
private Light MoonLight;
private Light SunLight;
public float SpeedUp;
private boolean DayTime;
private boolean NightTime;
public Color DayAmbient = new Color();
public Color NightAmbient = new Color();
public Color Adjusted = new Color();
public Color DayFog = new Color();
public Color NightFog = new Color();
public Color AdjustedFog = new Color();
public Color DaySky = new Color();
public Color NightSky = new Color();
public Color AdjustedSky = new Color();
private LightSettings Ambience;
private float Time;
private ModelRenderer SkyRender;
private Material SkyMat;
    /// Run only once
    @Override
    public void start() {
        SpeedUp = 0.8f;
        Ambience = WorldController.getLightSettings();
        MoonLight = Moon.findComponent("Light");
        SunLight = Sun.findComponent("Light");
        Adjusted.set(DayAmbient);
        AdjustedFog.set(DayFog);
        AdjustedSky.set(DaySky);
    }

    /// Repeat every frame
    @Override
    public void repeat() {
        //30 Minute Day-Night Cycle
        myObject.getTransform().rotate(0.005f * SpeedUp,0,0);
        Time = myObject.getTransform().getRotation().getX();
        //Sunset
      try{  if(Time >= 180 && SunLight.getIntensity() >= 0 && Time < 360)
        {
            SunLight.setIntensity(SunLight.getIntensity() - 0.001f);
        }
        } catch (Exception e) {}
        //Sunrise
      try {  if(Time >= 0 && SunLight.getIntensity() <= 0.8f && Time < 180)
        {
            SunLight.setIntensity(SunLight.getIntensity() + 0.001f);
        }
        } catch (Exception e) {}
        //Moonrise
   try {     if(Time >= 180 && MoonLight.getIntensity() <= 0.8f && Time < 360)
        {
            MoonLight.setIntensity(MoonLight.getIntensity() + 0.001f);
        }
        } catch(Exception e) {}
        //Moonset
      try { if(Time >= 0 && MoonLight.getIntensity() >= 0 && Time < 180)
        {
            MoonLight.setIntensity(MoonLight.getIntensity() - 0.001f);
        }
        } catch(Exception e) {}
  try {      Ambience.setAmbientColor(Adjusted);
        Ambience.setFogColor(AdjustedFog);
        SkyRender = WorldController.findObject("Boundary").findComponent("ModelRenderer");
        SkyMat = SkyRender.getMaterial();
        SkyMat.setColor("Color",AdjustedSky);
        } catch (Exception e) {}
        //Ambient Lighting
        if(Time >= 0 && Time < 180)
        {
            //Set Ambient Color
            if(Adjusted.getFloatRed() <= DayAmbient.getFloatRed())
            {
                Adjusted.setFloatRed(Adjusted.getFloatRed() + 0.005f);
            }
            if(Adjusted.getFloatGreen() <= DayAmbient.getFloatGreen())
            {
                Adjusted.setFloatGreen(Adjusted.getFloatGreen() + 0.005f);
            }
            if(Adjusted.getFloatBlue() <= DayAmbient.getFloatBlue())
            {
                Adjusted.setFloatBlue(Adjusted.getFloatBlue() + 0.005f);
            }
            if(Adjusted >= DayAmbient)
            {
                Adjusted.set(DayAmbient);
            }
            //Set Fog Color
            if(AdjustedFog.getFloatRed() <= DayFog.getFloatRed())
            {
                AdjustedFog.setFloatRed(AdjustedFog.getFloatRed() + 0.005f);
            }
            if(AdjustedFog.getFloatGreen() <= DayFog.getFloatGreen())
            {
                AdjustedFog.setFloatGreen(AdjustedFog.getFloatGreen() + 0.005f);
            }
            if(AdjustedFog.getFloatBlue() >= DayFog.getFloatBlue())
            {
                AdjustedFog.setFloatBlue(AdjustedFog.getFloatBlue() - 0.005f);
            }
            if(AdjustedFog >= DayFog)
            {
                AdjustedFog.set(DayFog);
            }
            //Set Sky Color
            if(AdjustedSky.getFloatRed() <= DaySky.getFloatRed())
            {
                AdjustedSky.setFloatRed(AdjustedSky.getFloatRed() + 0.005f);
            }
            if(AdjustedSky.getFloatGreen() <= DaySky.getFloatGreen())
            {
                AdjustedSky.setFloatGreen(AdjustedSky.getFloatGreen() + 0.005f);
            }
            if(AdjustedSky.getFloatBlue() <= DaySky.getFloatBlue())
            {
                AdjustedSky.setFloatBlue(AdjustedSky.getFloatBlue() + 0.005f);
            }
            if(AdjustedSky >= DaySky)
            {
                AdjustedSky.set(DaySky);
            }
        }
        if(Time >= 180 && Time < 360)
        {
            //Set Ambient Color
            if(Adjusted.getFloatRed() >= NightAmbient.getFloatRed())
            {
                Adjusted.setFloatRed(Adjusted.getFloatRed() - 0.005f);
            }
            if(Adjusted.getFloatGreen() >= NightAmbient.getFloatGreen())
            {
                Adjusted.setFloatGreen(Adjusted.getFloatGreen() - 0.005f);
            }
            if(Adjusted.getFloatBlue() >= NightAmbient.getFloatBlue())
            {
                Adjusted.setFloatBlue(Adjusted.getFloatBlue() - 0.005f);
            }
            if(Adjusted <= NightAmbient)
            {
                Adjusted.set(NightAmbient);
            }
            //Set Fog Color
            if(AdjustedFog.getFloatRed() >= NightFog.getFloatRed())
            {
                AdjustedFog.setFloatRed(AdjustedFog.getFloatRed() - 0.005f);
            }
            if(AdjustedFog.getFloatGreen() >= NightFog.getFloatGreen())
            {
                AdjustedFog.setFloatGreen(AdjustedFog.getFloatGreen() - 0.005f);
            }
            if(AdjustedFog.getFloatBlue() <= NightFog.getFloatBlue())
            {
                AdjustedFog.setFloatBlue(AdjustedFog.getFloatBlue() + 0.005f);
            }
            if(AdjustedFog <= NightFog)
            {
                AdjustedFog.set(NightFog);
            }
            //Set Sky Color
            if(AdjustedSky.getFloatRed() >= NightSky.getFloatRed())
            {
                AdjustedSky.setFloatRed(AdjustedSky.getFloatRed() - 0.005f);
            }
            if(AdjustedSky.getFloatGreen() >= NightSky.getFloatGreen())
            {
                AdjustedSky.setFloatGreen(AdjustedSky.getFloatGreen() - 0.005f);
            }
            if(AdjustedSky.getFloatBlue() >= NightSky.getFloatBlue())
            {
                AdjustedSky.setFloatBlue(AdjustedSky.getFloatBlue() - 0.005f);
            }
            if(AdjustedSky.getFloatGreen() <= NightSky.getFloatGreen())
            {
                AdjustedSky.set(NightSky);
            }
        }
        
    }
}
