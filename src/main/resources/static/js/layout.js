// Highlight active sidebar link
const links = document.querySelectorAll(".nav-link");
const currentPath = window.location.pathname;

links.forEach(link => {
    if (link.getAttribute("href") === currentPath) {
        links.forEach(l => l.classList.remove("active"));
        link.classList.add("active");
    }
});

// Dynamic year in footer
document.getElementById("year").textContent = new Date().getFullYear();
