import { useEffect, useState } from 'react';
import UserForm from '../../components/UserForm/UserForm';
import UserList from '../../components/UserList/UserList';
import {fetchUsers} from '../../Service/UserService.js'
import './ManageUsers.css';
import toast from 'react-hot-toast';

const ManageUsers = () => {

    const [users, setUsers] = useState([]);
    const [loading, setLoading] = useState(false);

    useEffect(() => {
        async function loadUsers() {
            try {
                setLoading(true);
                const response = await fetchUsers();
                setUsers(response.data);
            } catch (error) {
                console.error(error);
                toast.error("Unable to fetch users");
            } finally {
                setLoading(false);
            }
        }
        loadUsers();
    }, []);

    return(
        <div className="users-container text-light">
            <div className="left-column">
                <UserForm setUsers={setUsers} />
            </div>
            <div className="right-column">
                <UserList  users={users} setUsers={setUsers}/>
            </div>
        </div>
    );
}


export default ManageUsers;