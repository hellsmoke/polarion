/*
 coded by Kae - kae@verens.com
 I'd appreciate any feedback.
 You have the right to include this in your sites.
 Please retain this notice.
*/

function addEvent(el,ev,fn){
 if(el.attachEvent)el.attachEvent('on'+ev,fn);
 else if(el.addEventListener)el.addEventListener(ev,fn,false);
}

addEvent(window,'load',buildMultiselects);

function buildMultiselects(){
 do{
  found=0;
  a=document.getElementsByTagName('select');
  for(b=0;b<a.length,!found;b++){
   var ms=a[b];
   if(ms==null)break;
   if(ms.name.substring(ms.name.length-2,ms.name.length)=='[]'){
    found=1;
    disabled=(ms.disabled)?1:0;
    width=ms.offsetWidth;
    height=ms.offsetHeight;
    el=document.createElement('div');
    el.style.overflow='auto';
    el.style.width=width+"px";
    el.style.height=height+"px";
    el.style.border="2px solid #000";
    el.style.borderColor="#333 #ccc #ccc #333";
    c=ms.getElementsByTagName('option');
    for(d=0;d<c.length;d++){
     el2=document.createElement('span');
     el2.style.display="block";
     el2.style.border="1px solid #eee";
     el2.style.borderWidth="1px 0";
     el2.style.font="10px arial";
     el2.style.lineHeight="10px";
     el2.style.paddingLeft="20px";
     el3=document.createElement('input');
     el3.type="checkbox";
     if(c[d].selected){
      el3.checked="checked";
      el3.defaultChecked=true;
     }
     if(disabled)el3.disabled="disabled";
     el3.value=c[d].value;
     el3.style.marginLeft="-16px";
     el3.style.marginTop="-2px";
     el3.name=ms.name;
     el4=document.createTextNode(c[d].innerHTML);
     el2.appendChild(el3);
     el2.appendChild(el4);
     el.appendChild(el2);
    }
    ms.parentNode.insertBefore(el,ms);
    ms.parentNode.removeChild(ms);
   }
  }
 }while(found);
}
