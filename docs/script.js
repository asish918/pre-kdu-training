const count = document.querySelector('.count-num');
const buttons = document.querySelectorAll('.btn');


buttons.forEach((btn) => {
    btn.addEventListener('click', () => {
        if (btn.className.includes('increase-btn-ctn')) {
            count.innerHTML++;
        } else if (btn.className.includes('decrease-btn-ctn')) {
            count.innerHTML--;
        } else if (btn.className.includes('reset-btn')) {
            count.innerHTML= 0;
        }
    })
})

