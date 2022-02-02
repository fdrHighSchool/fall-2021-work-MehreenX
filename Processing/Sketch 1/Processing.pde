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
//black
fill(0,0,0);
size(600, 600);
line(200, 400, 380, 400);
size(600,600);
line(100,335,480,335);
size(600, 600);
//brown
fill(148, 64, 0);
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
triangle(530,280, 510, 300, 520, 300);
triangle(540,285, 530, 310, 530, 320);
triangle(555,289, 550, 330, 540, 335);
triangle(560,285, 570, 310, 570, 320);
triangle(560,285, 570, 310, 570, 320);
triangle(560,265, 590, 310, 600, 310);
triangle(565,260, 600, 268, 600, 250);
triangle(520,255, 500, 240, 500, 200);
triangle(540,245, 530, 220, 550, 180);
triangle(560,260, 575, 240, 576, 200);
//green
fill(212, 255, 179);
quad(230, 305, 290, 200, 350, 305, 290, 400);

 
