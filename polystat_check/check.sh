rm -rf output/main.eo
rm -rf output/stdlib

java -jar ../build/libs/J2EO-0.2.0.jar PolystatTest.java -o output
cp -R ../src/main/resources/stdlib output/

mv output/PolystatTest.eo output/main.eo

if [ ! -f polystat.jar ] ; then
  wget -O polystat.jar "https://repo.maven.apache.org/maven2/org/polystat/polystat/0.4.2/polystat-0.4.2-jar-with-dependencies.jar"
fi

java -jar polystat.jar output temp
