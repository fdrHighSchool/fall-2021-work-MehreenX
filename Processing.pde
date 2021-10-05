size(600,600); 
background(0); 
int gridSize = 60;
for (int x = gridSize; x <= width - gridSize; x += gridSize) {
  for (int y = gridSize; y <= height - gridSize; y += gridSize) {
    noStroke();
    fill(255);
    rect(x-1, y-1, 3, 3);
    stroke(255, 100);
    line(x, y, width/2, height/2);
  }
}
size(600,600);
triangle(200, 350, 290, 500, 380, 350);
// purple
fill(0,0,0);
size(600, 600);
line(200, 400, 380, 400);
size(600,600);
line(100,335,480,335);
size(600, 600);
rect(185, 290, 210, 30);
//black
fill(51, 121, 242);
size (600,600);
triangle(200, 280, 290, 150, 380, 280);
size(600,600);
line(200, 240, 380, 240);
size(600,600);
line(100,335,50,300);
size(600,600);
line(480,335,542,300);
//light blue circle
fill(219, 213, 213);
circle(50, 260, 70);
fill(237, 237, 237);
circle(70,280,10);
fill(237, 237, 237);
circle(60,250,10);
fill(237, 237, 237);
circle(30,270,20);
fill(237, 237, 237);
circle(35,260,10);
//Sun
fill(255, 190, 77);
circle(545,260, 70);
fill(255, 132, 66);
triangle(515,260, 500, 280, 500, 300);
