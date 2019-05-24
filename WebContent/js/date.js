(function () {
    var date = new Date().toISOString().substring(0, 10),
        field = document.querySelector('#date');
    field.value = date;
})()​