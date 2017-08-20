function addAttribute() {
    var newRowContent = '<tr>' +
        '<td><input id="name{{index}}" placeholder="Name" type="text" class="form-control" style="width: 250px;" /></td>' +
        '<td>' + '<select class="form-control" style="width: 250px;">' + '<option value="Text">Text</option>' + '<option value="Currency">Currency</option>' +
        '<option value="Date">Date</option>' + '<option value="Number">Number</option>' +
        '</select>' + '</td>' + '<td>' + '<input id="length{{index}}" type="text" class="form-control" placeholder="10" style="width: 250px;" />' +
        '</td>' + '<td><button class="btn btn-default" onclick="deleteRow(this)">Delete</button></td>' + '</tr>';
    $("#tableBody").append(newRowContent);
    // var tableBody = document.getElementById("tableBody");
    // tableBody.innerHTML += newRowContent;
}
function deleteRow(r) {
    var i = r.parentNode.parentNode.rowIndex;
    document.getElementById("table").deleteRow(i);
}