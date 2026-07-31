/* =====================================
   OUR LITTLE UNIVERSE ❤️
   Part 3A
===================================== */

// ----------------------
// Elements
// ----------------------

const loginPage = document.getElementById("loginPage");
const loadingPage = document.getElementById("loadingPage");
const mainWebsite = document.getElementById("mainWebsite");

const progress = document.querySelector(".progress");

const letter = document.querySelector(".letter");

const openLetterBtn = document.getElementById("openLetter");

// ----------------------
// Password
// ----------------------

function checkPassword(){

    const password =
    document.getElementById("password").value.trim();

    if(password.toLowerCase() === "adiifiza"){

        loginPage.style.display="none";

        loadingPage.style.display="flex";

        let width = 0;

        let loading = setInterval(()=>{

            width++;

            progress.style.width = width+"%";

            if(width>=100){

                clearInterval(loading);

                loadingPage.style.display="none";

                mainWebsite.style.display="block";

                window.scrollTo(0,0);

            }

        },30);

    }

    else{

        alert("Wrong Password ❤️");

    }

}

// ----------------------
// Envelope
// ----------------------

openLetterBtn.addEventListener("click",()=>{

    letter.style.display="block";

    letter.animate([

        {opacity:0,transform:"translateY(40px)"},

        {opacity:1,transform:"translateY(0px)"}

    ],{

        duration:1000,

        fill:"forwards"

    });

});

// ----------------------
// Love Counter
// ----------------------

const togetherDate =
new Date("June 23, 2026 00:00:00").getTime();

function updateCounter(){

    const now =
    new Date().getTime();

    const diff = now - togetherDate;

    const days =
    Math.floor(diff/(1000*60*60*24));

    const years =
    Math.floor(days/365);

    const months =
    Math.floor((days%365)/30);

    const remainingDays =
    (days%365)%30;

    const hours =
    new Date().getHours();

    const minutes =
    new Date().getMinutes();

    const seconds =
    new Date().getSeconds();

    document.getElementById("loveCounter").innerHTML=

    `
    <div>${years}<br>Years</div>

    <div>${months}<br>Months</div>

    <div>${remainingDays}<br>Days</div>

    <div>${hours}<br>Hours</div>

    <div>${minutes}<br>Minutes</div>

    <div>${seconds}<br>Seconds</div>
    `;

}

setInterval(updateCounter,1000);

updateCounter();

// ----------------------
// Typewriter Letter
// ----------------------

const letterText = `

Happy Girlfriend's Day Fiza ❤️

From the day you came into my life,
everything became brighter.

Thank you for every smile,
every laugh,
every hug,
every memory.

I don't know what tomorrow holds...

But I know I want every tomorrow
to have you in it.

Forever Yours,

Adii ❤️

`;

function typeWriter(){

    let i=0;

    letter.innerHTML="";

    function typing(){

        if(i<letterText.length){

            letter.innerHTML+=letterText.charAt(i);

            i++;

            setTimeout(typing,35);

        }

    }

    typing();

}/* =====================================
   PART 3B
   Hearts • Gallery • Surprise
===================================== */

// ----------------------
// Heart Cursor Trail
// ----------------------

document.addEventListener("mousemove",(e)=>{

    const heart=document.createElement("div");

    heart.className="heart";

    heart.style.left=e.pageX+"px";

    heart.style.top=e.pageY+"px";

    document.body.appendChild(heart);

    setTimeout(()=>{
        heart.remove();
    },5000);

});

// ----------------------
// Sparkles
// ----------------------

setInterval(()=>{

    const sparkle=document.createElement("div");

    sparkle.className="sparkle";

    sparkle.style.left=Math.random()*window.innerWidth+"px";

    sparkle.style.top=Math.random()*window.innerHeight+"px";

    document.body.appendChild(sparkle);

    setTimeout(()=>{
        sparkle.remove();
    },2000);

},300);

// ----------------------
// Rose Petals
// ----------------------

setInterval(()=>{

    const petal=document.createElement("div");

    petal.className="petal";

    petal.style.left=Math.random()*window.innerWidth+"px";

    petal.style.animationDuration=
    (5+Math.random()*6)+"s";

    document.body.appendChild(petal);

    setTimeout(()=>{
        petal.remove();
    },12000);

},700);

// ----------------------
// Gallery Click Effect
// ----------------------

const images=document.querySelectorAll(".photos img");

images.forEach(img=>{

    img.addEventListener("click",()=>{

        const overlay=document.createElement("div");

        overlay.style.position="fixed";
        overlay.style.inset="0";
        overlay.style.background="rgba(0,0,0,.95)";
        overlay.style.display="flex";
        overlay.style.alignItems="center";
        overlay.style.justifyContent="center";
        overlay.style.zIndex="9999";

        const photo=document.createElement("img");

        photo.src=img.src;

        photo.style.maxWidth="90%";
        photo.style.maxHeight="90%";
        photo.style.borderRadius="20px";
        photo.style.boxShadow="0 0 40px hotpink";

        overlay.appendChild(photo);

        overlay.onclick=()=>overlay.remove();

        document.body.appendChild(overlay);

    });

});

// ----------------------
// Surprise Button
// ----------------------

const surpriseBtn=
document.getElementById("surpriseBtn");

surpriseBtn.addEventListener("click",()=>{

    document.body.style.transition="2s";

    document.body.style.background="#000";

    alert("❤️ Happy Girlfriend's Day Fiza ❤️");

    launchFireworks();

});

// ----------------------
// Simple Fireworks
// ----------------------

function launchFireworks(){

    for(let i=0;i<120;i++){

        const star=document.createElement("div");

        star.style.position="fixed";

        star.style.width="6px";

        star.style.height="6px";

        star.style.borderRadius="50%";

        star.style.background=
        `hsl(${Math.random()*360},100%,70%)`;

        star.style.left="50%";
        star.style.top="50%";

        star.style.zIndex="9999";

        document.body.appendChild(star);

        const x=(Math.random()-0.5)*900;

        const y=(Math.random()-0.5)*900;

        star.animate([

            {
                transform:"translate(0,0)",
                opacity:1
            },

            {
                transform:`translate(${x}px,${y}px)`,
                opacity:0
            }

        ],{

            duration:2200,

            easing:"ease-out"

        });

        setTimeout(()=>{

            star.remove();

        },2200);

    }

}

// ----------------------
// Easter Egg
// ----------------------

let taps=0;

document.querySelector(".ending h1")
.addEventListener("click",()=>{

    taps++;

    if(taps===7){

        alert(
`❤️ Secret Message ❤️

Fiza,

You're my favorite person,
my favorite memory,
and my favorite future.

Forever Yours,
Adii ❤️`
        );

        taps=0;

    }

});/* =====================================
   PART 3C
   Music • Shooting Stars • Replay
===================================== */

// ----------------------
// Background Music
// ----------------------

const bgMusic = new Audio("assets/music/song.mp3");
bgMusic.loop = true;
bgMusic.volume = 0.4;

document.getElementById("surpriseBtn").addEventListener("click", () => {
    bgMusic.play().catch(() => {
        console.log("Music will play after user interaction.");
    });
});

// ----------------------
// Shooting Stars
// ----------------------

function createShootingStar(){

    const star=document.createElement("div");

    star.style.position="fixed";
    star.style.top=Math.random()*250+"px";
    star.style.left="-120px";

    star.style.width="140px";
    star.style.height="2px";

    star.style.background="linear-gradient(to right,white,transparent)";

    star.style.transform="rotate(-20deg)";

    star.style.zIndex="1";

    document.body.appendChild(star);

    star.animate([

        {transform:"translateX(0px) rotate(-20deg)",opacity:1},

        {transform:"translateX(1600px) translateY(350px) rotate(-20deg)",opacity:0}

    ],{

        duration:2500

    });

    setTimeout(()=>star.remove(),2500);

}

setInterval(createShootingStar,8000);

// ----------------------
// Heart Explosion
// ----------------------

document.addEventListener("click",(e)=>{

    for(let i=0;i<18;i++){

        const heart=document.createElement("div");

        heart.innerHTML="❤️";

        heart.style.position="fixed";
        heart.style.left=e.clientX+"px";
        heart.style.top=e.clientY+"px";
        heart.style.fontSize="18px";
        heart.style.pointerEvents="none";

        document.body.appendChild(heart);

        const x=(Math.random()-0.5)*250;
        const y=(Math.random()-0.5)*250;

        heart.animate([

            {transform:"translate(0,0)",opacity:1},

            {transform:`translate(${x}px,${y}px) scale(0)`,opacity:0}

        ],{

            duration:1200

        });

        setTimeout(()=>heart.remove(),1200);

    }

});

// ----------------------
// Replay Button
// ----------------------

const replay=document.createElement("button");

replay.innerHTML="💖 Replay Our Story";

replay.style.position="fixed";
replay.style.bottom="30px";
replay.style.right="30px";
replay.style.display="none";
replay.style.zIndex="999";

document.body.appendChild(replay);

document.getElementById("surpriseBtn").addEventListener("click",()=>{

    setTimeout(()=>{

        replay.style.display="block";

    },5000);

});

replay.onclick=()=>{

    window.scrollTo({

        top:0,

        behavior:"smooth"

    });

};

// ----------------------
// Final Message
// ----------------------

setTimeout(()=>{

console.log("Made with ❤️ by Adii");

},1000);
