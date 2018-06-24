$(document).ready(function () {
    readAllE();

    $('.sidenav').sidenav();
    const sideNav = document.querySelector('.sidenav');
    M.Sidenav.init(sideNav, {});

    const slider = document.querySelector('.slider');
    M.Slider.init(slider, {
        indicators: false,
        height: 600,
        transition: 500,
        interval: 5500

    });
    $('.parallax').parallax();
    var $sm = 480;
    var $md = 768;

    function resizeThis() {
        $imgH = $('.middle img').width();
        if ($(window).width() >= $sm) {
            $('.left,.right,.section').css('height', $imgH);
        } else {
            $('.left,.right,.section').css('height', 'auto');
        }
    }
    resizeThis();

    $(window).resize(function () {
        resizeThis();
    });

    $(window).scroll(function () {
        $('.section').each(function () {
            var $elementPos = $(this).offset().top;
            var $scrollPos = $(window).scrollTop();

            var $sectionH = $(this).height();
            var $h = $(window).height();
            var $sectionVert = (($h / 2) - ($sectionH / 4));


            if (($elementPos - $sectionVert) <= $scrollPos && ($elementPos - $sectionVert) + $sectionH > $scrollPos) {
                $(this).addClass('animate');
            } else {
                $(this).removeClass('animate');
            }
        });
    });
});

function readAllE() {
    $('#entradas_detalle_modal').modal();
}

$(function () {
    $('a[href*="#"]:not([href="#"])').click(function () {
        if (location.pathname.replace(/^\//, '') == this.pathname.replace(/^\//, '') && location.hostname == this.hostname) {
            var target = $(this.hash);
            target = target.length ? target : $('[name=' + this.hash.slice(1) + ']');
            if (target.length) {
                $('html, body').animate({
                    scrollTop: target.offset().top
                }, 1000);
                return false;
            }
        }
    });
});


const sideNav = document.querySelector('.sidenav');
M.Sidenav.init(sideNav, {});
const slider = document.querySelector('.slider');
M.Slider.init(slider, {
    indicators: false,
    height: 600,
    transition: 500,
    interval: 5500

});