//# java-test-0003-final-14703-kaustubh
//Final Project Assignment - This repository contains the complete final project code and documentation.
let rows = 6;

for (let i = 1; i <= rows; i++) 
{
    let linee = "";
    
    for (let j = 1; j <= i; j++)
    {
        linee += (i + j) % 2 === 0 ? "1 " : "0 ";
    }
    console.log(linee);
}
