/**
 * 
 */

$(document).ready(function () {
	var result;
	$('#submit1').click(function(){
//		$.ajax({
//			url: CONTEXT_PATH+"/EdiJson",
//			type:'POST',
//			data : {storer:"test"},
//			dataType:'json',
//				success:function(data){
//					console.log('data '+data.storer);
//				}
//		       ,
//		       error:function(e){
//		    	   console.log(e);
//		       }
//			
//		});
		
		 $('#table1').bootstrapTable("refresh", {
			 url: CONTEXT_PATH+"/table1"  
			    });
		 
	});
	
	$('#update').click(function(){
		var param=[];
		console.log('getDate:'+JSON.stringify($('#table1').bootstrapTable('getData')));
		$('.turnSelect').each(function(e){
			console.log($(this).val()+','+$(this).attr('datastream'));
			console.log('result:'+result[e].active);
			if($(this).val()!=result[e].active){
				param.push({
					'active':$(this).val(),
					'datastream':result[e].datastream,
					'description':result[e].description,
					'storer':result[e].storer
				})
			}
			 
		});
		  
		if(param.length!=0){ 
		 $('#table1').bootstrapTable("refresh", {
			 url: CONTEXT_PATH+"/update",
			 query:{ediTable: param }
			    });
	}
	});
	
	$('#table1').on('load-success.bs.table', function (e, arg1, arg2) {
	    console.log(e);
	    console.log(arg1);
	    console.log(arg2);
	    console.log('refresh:'+JSON.stringify($('#table1').bootstrapTable('getData')));
	    result=$('#table1').bootstrapTable('getData');
	});

	
	 
});
function storerNum(params){
	 console.log(params);
	 return{
		 
		 storerNum:'test'
	 };
	  
}

function field1(value, row, index){
	if('1'==value){
		return '<select class="bootstrap-select turnSelect" datastream="turn'+row.datastream+'">'+
		'<option value="1" selected="selected">true</option>'+
		'<option value="0" >false</option>'+
		'</select>'
	}else{
		return '<select class="bootstrap-select turnSelect" datastream="turn'+row.datastream+'">'+
		'<option value="1">true</option>'+
		'<option value="0"  selected="selected">false</option>'+
		'</select>'
	} 
}


