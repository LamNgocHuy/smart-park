<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 3/19/2021
  Time: 5:28 PM
  To change this template use File | Settings | File Templates.
--%>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"/>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"/>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<script src="https://cdn.datatables.net/1.10.22/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/1.10.22/js/dataTables.bootstrap4.min.js"></script>
<link rel="stylesheet" href="https://cdn.datatables.net/1.10.22/css/dataTables.bootstrap4.min.css">
<style>
    html,body{
        font-family: 'JetBrains Mono', sans-serif;
        font-size: 15px;
        max-width: 100vw;
        line-height: 1.8;
        display: flex;
        background-color: #5E72E4;
        color: #777d74;
        user-select: none;
        overflow: hidden;
    }
    .mycolor {
        background-color: #0dd6b8;
        border-color: #0dd6b8;
        color: white
    }
    /*pagnition style*/
    .page-item.active .page-link{
        background-color: #0dd6b8;
        border-color: #0dd6b8;
    }
    a.page-link{
        color: #0dd6b8;
    }
    /*end pagnition style*/
    a{
        text-decoration: none !important;
        color: #333333;
        outline: none !important;
    }
    .menu{
        width: 280px;
        height: 642px;
        max-height: 90vh;
        background-color: white;
        margin: 40px;
        border-radius: 10px;
    }
    .content{
        width: 1070px;
        max-width: 1070px;
        height: 642px;
        max-height: 90vh;
        align-items: center;
        background-color: white;
        border-radius: 10px;
        margin: 40px;
        margin-left: 0;
        padding: 15px;
        overflow: auto;
    }
    .menu-title{
        font-size: 24px;
        font-weight: bold;
        color: #5E72E4;
        margin: 38px 89px 47px 90px;
        text-align: center;
    }
    .menu-link {
        font-size: 14px;
        text-align: left;
    }
    .menu-item{
        width: 250px;
        height: 55px;
        display: inline-block;
        margin: 5px 15px 15px 15px;
        padding: 12px 0 10px 5px;
        border-radius: 8px;
    }
    .menu-item:hover{
        background-color: #F6F9FC;
        color: #333;
    }
    .menu-item > i{
        width: 20px;
        height: 20px;
        font-size: 20px;
        margin-right: 10px;
    }
    table > tbody > tr > td {
        font-size: 13px;
        color: #525F7F;
        vertical-align: middle !important;
    }
    .content-title{
        max-width: 100%;
        height: 50px;
        overflow: hidden;
    }
    .content-title > p {
        float: left;
        color: #32325D;
        font-size: 17px;
        font-weight: 600;
        line-height: 1.5;
    }
</style>
<script>
    $(document).ready(function() {
        $('#example').DataTable();
    } );
</script>
