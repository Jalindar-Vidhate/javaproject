function ajax(str)
{
	let xhttp=new XMLHttpRequest();
	
	xhttp.onreadystatechange = function() {
  if (this.readyState == 4 && this.status == 200) {
    document.getElementById("b").innerHTML = this.responseText;
  }
};
xhttp.open("GET", "search?name="+str, true);
xhttp.send();
}