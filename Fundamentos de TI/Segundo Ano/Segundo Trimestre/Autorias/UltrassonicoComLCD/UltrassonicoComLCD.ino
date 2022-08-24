#include <Wire.h>
#include <LiquidCrystal_I2C.h>
LiquidCrystal_I2C lcd(0x27,16,2);

#include <Ultrasonic.h>
#define pino_trigger 4
#define pino_echo 5
Ultrasonic ultrasonic(pino_trigger, pino_echo);

void setup()
{
 lcd.init();
 Serial.begin(4800);
 Serial.println(Lendo dados do sensor...);

  lcd.setBacklight(HIGH);
  lcd.setCursor(0,0);
  lcd.print(Lendo dados);
  lcd.setCursor(0,1);
  lcd.print(do sensor...);
  delay(3000);
  lcd.setBacklight(LOW);
  delay(750);
  lcd.clear();
}




void loop()
{
  float cmMsec, inMsec;
  long microsec = ultrasonic.timing();
  cmMsec = ultrasonic.convert(microsec, Ultrasonic::CM);
  inMsec = ultrasonic.convert(microsec, Ultrasonic::IN);
  //Exibe informacoes no serial monitor
  Serial.print(Distancia em cm: );
  Serial.print(cmMsec);
  Serial.print( - Distancia em polegadas: );
  Serial.println(inMsec);
  delay(1000);


  lcd.setBacklight(HIGH);
  lcd.setCursor(0,0);
  lcd.print(Distancia em cm:);
  lcd.setCursor(0,1);
  lcd.print(cmMsec);
  delay(4800);
  lcd.setBacklight(LOW);
  delay(750);
  lcd.clear();

}
