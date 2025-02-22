function dis(v){
    document.getElementById('scr').value+=v
}
function clearScn(){
    document.getElementById('scr').value=""
}
function eq(){
    document.getElementById('scr').value = eval(document.getElementById('scr').value)
}