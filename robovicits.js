function reload()
{
    location.reload();
}
  
function maker()
{ 
    let x=document.querySelector('input').value;
    console.log(x);
    document.querySelector('form').style.visibility="hidden";
    document.getElementById('tiles').style.visibility="visible";
    var e = document.getElementById('box'); 
    for(let i=0;i<=x-1;i++){
      let tile=document.createElement('div');
      tile.id="row";
      tile.setAttribute('onclick','play()');
      tile.innerHTML="Click Here to Play";
      e.appendChild(tile);
    }
    
}

const songs=["Audio_1.mp3","Audio_2.mp3"]

function choose()
{
  
}

let song=new Audio(songs[0]);
function play()
{
    songs.play();
}