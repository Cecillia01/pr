let previewContainer = document.querySelector('.goals-preview');
let previewBox = previewContainer.querySelectorAll('.preview');

document.querySelectorAll('.goal-container .goal').forEach(goal => {
    goal.onclick = () => {
        previewContainer.style.display = 'flex';
        let name = goal.getAttribute('data-name');
        previewBox.forEach(preview => {
            let target = preview.getAttribute('data-target');
            if (name == target) {
                preview.classList.add('active');
            }
        });
    };
});
previewBox.forEach(close =>{
    close.querySelector('.fi-br-cross-small').onclick = () =>{
        close.classList.remove('active');
        previewContainer.style.display = 'none';
    }
});
